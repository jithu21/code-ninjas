(function ()
{
    'use strict';

    angular
        .module('app.rules')
        .controller('RulesController', RulesController);

    /** @ngInject */
    function RulesController()
    {
        var vm = this;
        vm.location = true;



        // Methods

        vm.loadUsers = function(event){
           vm.users =[{"name":"Food"},{"name":"Location"},{"name":"Active"},{"name":"Inactive"}];
        }

      // method to fetch varities under category items

        vm.fetchVarirties = function () {
          vm.varityItems = [{"variety_name":"varity1"},{"variety_name":"varity2"},{"variety_name":"varity3"}];
        }

        vm.listCountries = function(){
          vm.countries = [{"name":"Gujarat"},{"name":"Pakistan"},{"name":"China"}];
        }
        vm.listTypeofUsers=function(){
          vm.userType = [{"type":"List1"},{"type":"List2"},{"type":"List3"},{"type":"List5"},{"type":"List6"},{"type":"List7"}];
        }
        vm.schdulerDetails = function () {
          vm.schduleType = [{"type":"Run Now"},{"type":"Run Weekly"},{"type":"Run Monthly"},{"type":"Run Everyday"},{"type":"Custom Schdule"}]
        }

    }

})();
