(function ()
{
    'use strict';

    angular
        .module('app.sample', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider, $translatePartialLoaderProvider, msNavigationServiceProvider)
    {
        // State
        $stateProvider
            .state('app.sample', {
                url    : '/sample',
                views  : {
                    'content@app': {
                        templateUrl: 'app/main/sample/sample.html',
                        controller : 'SampleController as vm'
                    }
                },
                resolve: {
                    SampleData: function (apiResolver)
                    {
                        return apiResolver.resolve('sample@get');
                    }
                }
            });

        // Translation
        $translatePartialLoaderProvider.addPart('app/main/sample');

        // Navigation
        msNavigationServiceProvider.saveItem('fuse', {
            title : 'OPINIO',
            group : true,
            weight: 1
        });
        msNavigationServiceProvider.saveItem('fuse.forms', {
          title      : 'Customers',
          icon       : 'icon-amazon-clouddrive',
          state      : 'app.s3',
          weight     : 2
        });
    }
})();
