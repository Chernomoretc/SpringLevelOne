angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app/api/v1';

    $scope.loadProducts = function (pageIndex =1) {
         $http({
                    url: contextPath + '/products',
                    method: 'GET',
                    params: {
                   min_cost: $scope.filter ? $scope.filter.min_cost : null,
                   max_cost: $scope.filter ? $scope.filter.max_cost : null
                    }
                }).then(function (response) {
                        $scope.ProductsList = response.data.content;
                });
    }


    $scope.deleteProduct = function (productId) {
       $http.delete(contextPath + '/products/' + productId)
           .then(function (response) {
                $scope.loadProducts();
        });
    }

//не придимул как упаковать из index данные в json
    $scope.changeCost = function (productId,cost, delta) {
       if(cost==1 && delta==-1 ){delta=0}

               $http({
                   url: contextPath + '/products',
                   method: 'PUT',
                   params: {
                       productId: productId,
                       delta: delta
                   }
               }).then(function (response) {
                   $scope.loadProducts();
               });
    }

    $scope.createProduct = function () {
            console.log($scope.newProduct);
            $http.post(contextPath + '/products', $scope.newProduct)
                .then(function (response) {
                    $scope.loadProducts();
                });
    }

     $scope.loadCart = function () {
                 $http.get(contextPath + '/cart')
                        .then(function (response) {
                            $scope.CartList = response.data;
                        });
        }

    $scope.addCart = function (p) {
    $scope.Product = p;
             $http.post(contextPath + '/cart', $scope.Product)
                    .then(function (response) {
                       $scope.loadCart();
                    });
    }

    $scope.deleteInCart = function (id) {
             $http.delete(contextPath + '/cart/'+ id)
                        .then(function (response) {
                           $scope.loadCart();
                        });
        }

    $scope.loadProducts();
});


