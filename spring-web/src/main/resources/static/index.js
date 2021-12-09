angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';


    $scope.loadProducts = function () {
        $http.get(contextPath + '/products')
            .then(function (response) {
                $scope.ProductsList = response.data;
            });
    };

    $scope.deleteProduct = function (productId) {
        $http({
            url: contextPath + '/products/delete',
            method: 'GET',
            params: {
            productId: productId,
            }
        }).then(function (response) {
                $scope.filterMinMax();
        });
    }

    $scope.filterMinMax = function () {
         $http({
                        url: contextPath + '/products/filter',
                        method: 'GET',
                        params: {
                            min : $scope.filter.min,
                            max : $scope.filter.max
                        }
                    }).then(function (response) {
                        $scope.ProductsList = response.data;
                    });
                }



    $scope.changeCost = function (productId,cost, delta) {
    if(cost==1 && delta==-1 ){delta=0}

        $http({
            url: contextPath + '/products/change_cost',
            method: 'GET',
            params: {
                productId: productId,
                delta: delta
            }
        }).then(function (response) {
            $scope.filterMinMax();
        });
    }

    $scope.loadProducts();
});


