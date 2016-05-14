(function ()
{
    'use strict';

    angular
        .module('app.user')
        .controller('userController', userController);

    /** @ngInject */
    function userController()
    {
        var vm = this;

        // Data
        vm.users = [ { name:"Jithendra", "role":"Admin", "createdBy":"Jithendra", "createdAt":"2015/12/21"},
          { name:"Prasath", "role":"Admin", "createdBy":"Jithendra", "createdAt":"2015/12/22"},
          { name:"Vivek", "role":"User", "createdBy":"Jithendra", "createdAt":"2015/12/22"},
          { name:"Ganesh", "role":"User", "createdBy":"Prasath", "createdAt":"2015/12/22"},
          { name:"Ram", "role":"User", "createdBy":"Jithendra", "createdAt":"2015/12/23"},
          { name:"Gerard", "role":"User", "createdBy":"Prasath", "createdAt":"2015/12/24"},
          { name:"Rahul", "role":"Admin", "createdBy":"Prasath", "createdAt":"2015/12/21"},
          { name:"Rakesh", "role":"User", "createdBy":"Jithendra", "createdAt":"2015/12/24"},
          { name:"Rajeev", "role":"User", "createdBy":"Jithendra", "createdAt":"2015/12/26"},
          { name:"Sneha", "role":"User", "createdBy":"Jithendra", "createdAt":"2015/12/27"},
          { name:"Jithendra", "role":"Admin", "createdBy":"Jithendra", "createdAt":"2015/12/21"}];

        vm.dtOptions = {
            dom       : '<"top"f>rt<"bottom"<"left"<"length"l>><"right"<"info"i><"pagination"p>>>',
            pagingType: 'simple',
            autoWidth : false,
            responsive: true
        };

        // Methods

        //////////
    }

})();
