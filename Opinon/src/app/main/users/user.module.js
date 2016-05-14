(function ()
{
    'use strict';

    angular
        .module('app.user', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider,msNavigationServiceProvider)
    {
        $stateProvider.state('app.user', {
            url    : '/opinio/customermanagement',
            views  : {
                'content@app': {
                    templateUrl: 'app/main/users/user.html',
                    controller : 'userController as vm'
                }
            },
            resolve: {
                Employees: function (apiResolver)
                {
                    return [];
                }
            }
        });
      msNavigationServiceProvider.saveItem('fuse.users', {
        title : 'Customer Management',
        icon  : 'icon-account-multiple',
        state : 'app.user'
      });
    }

})();
