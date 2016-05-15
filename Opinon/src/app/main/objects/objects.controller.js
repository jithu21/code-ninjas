(function ()
{
    'use strict';

    angular
        .module('app.objects')
        .controller('ObjectsController', ObjectsController);

    /** @ngInject */
    function ObjectsController($http)
    {
        var vm = this;

        // Data
        vm.objects = [{"name":"Bids", "source":"S3", "format":"CSV", "createdBy":"Jithendra", "createdAt":"2015/12/25"},
          {"name":"Temperate", "source":"FTP", "format":"tsv", "createdBy":"Prasath", "createdAt":"2015/12/25"},
          {"name":"Account", "source":"S3", "format":"CSV", "createdBy":"Vivek", "createdAt":"2015/12/25"},
          {"name":"Student", "source":"FTP", "format":"JSON", "createdBy":"Ramesh", "createdAt":"2015/12/25"},
          {"name":"User", "source":"Streaming", "format":"TSV", "createdBy":"Jithendra", "createdAt":"2015/12/25"}
          ];

        vm.dtOptions = {
            dom       : '<"top"f>rt<"bottom"<"left"<"length"l>><"right"<"info"i><"pagination"p>>>',
            pagingType: 'simple',
            autoWidth : false,
            responsive: true
        };
      vm.customer_health= customer_health;
      vm.arrays=[];

      function customer_health() {
        $http({
          method: 'GET',
          url: 'http://172.31.98.153:8080/healthBasedOnLocation',
          headers: {
            'content-type': 'application/json; charset=utf-8',
            'Access-Control-Allow-Headers': 'Content-Type, Content-Range, Content-Disposition, Content-Description'
          }
        }).success(function (data) {
          if (data) {
            var arr=[];

            for(var i =0; i<data.length; i++){
              arr.push({"label":data[i].city,"value":data[i].totalOrders})
            }
            vm.multiBarHorizontalChart = {
              options: {
                chart: {
                  type              : 'multiBarHorizontalChart',
                  height            : 450,
                  x                 : function (d)
                  {
                    return d.label;
                  },
                  y                 : function (d)
                  {
                    return d.value;
                  },
                  showControls      : true,
                  showValues        : true,
                  transitionDuration: 300,
                  xAxis             : {
                    showMaxMin: false
                  },
                  yAxis             : {
                    tickFormat: function (d)
                    {
                      return d3.format(',.2f')(d);
                    }
                  }
                }
              },
              data   : [
                {
                  'key'   : 'Active',
                  'color' : '#d62728',
                  'values': arr
                },
                {
                  'key'   : 'In Active',
                  'color' : '#1f77b4',
                  'values': [
                    {
                      'label': 'Bangalore',
                      'value': 40
                    },
                    {
                      'label': 'Pune',
                      'value': 35
                    }
                  ]
                }
              ]
            };
          }
        }).error(function (data, status, headers, config) {

        });
      };
      vm.customer_health();


        // Methods

        //////////
    }

})();
