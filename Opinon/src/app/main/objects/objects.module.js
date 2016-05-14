(function ()
{
    'use strict';

    angular
        .module('app.objects', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider,msNavigationServiceProvider)
    {
        $stateProvider.state('app.objects', {
            url    : '/opinio/health',
            views  : {
                'content@app': {
                    templateUrl: 'app/main/objects/objects.html',
                    controller : 'ObjectsController as vm'
                }
            }
        });
      msNavigationServiceProvider.saveItem('fuse.objects', {
        title : 'Customer Health',
        icon  : 'icon-plus',
        state : 'app.objects'
      });
    }

})();
