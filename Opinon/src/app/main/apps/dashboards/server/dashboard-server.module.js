(function ()
{
    'use strict';

    angular
        .module('app.dashboards.server', [])
        .config(config);

    /** @ngInject */
    function config($stateProvider)
    {
        // State
        $stateProvider.state('app.dashboards_server', {
            url      : '/dashboard-server',
            views    : {
                'content@app': {
                    templateUrl: 'app/main/apps/dashboards/server/dashboard-server.html',
                    controller : 'DashboardServerController as vm'
                }
            },
            resolve  : {
                DashboardData: function (apiResolver)
                {
                    return {
                      "widget1": {
                        "title": "Customer/Orders Dashboard ",
                        "chart": [
                          {
                            "key": "Total Orders",
                            "values": [
                              {"x": 1, "y": 10000},
                              {"x": 2, "y": 12000},
                              {"x": 3, "y": 10000},
                              {"x": 4, "y": 9000},
                              {"x": 5, "y": 11500},
                              {"x": 6, "y": 12500},
                              {"x": 7, "y": 13000},
                              {"x": 8, "y": 10000},
                              {"x": 9, "y": 12000},
                              {"x": 10, "y": 7000}
                            ]
                          },
                          {
                            "key": "Total Customers",
                            "values": [
                              {"x": 1, "y": 8000},
                              {"x": 2, "y": 9000},
                              {"x": 3, "y": 7000},
                              {"x": 4, "y": 8500},
                              {"x": 5, "y": 10000},
                              {"x": 6, "y": 12000},
                              {"x": 7, "y": 10000},
                              {"x": 8, "y": 9000},
                              {"x": 9, "y": 10000},
                              {"x": 10, "y": 5000}
                            ]
                          }
                        ]
                      },
                      "widget2": {
                        "title": "Total Customers",
                        "value": {
                          "used": "0.15 Million",
                          "total": "",
                          "percentage": 67.45
                        },
                        "detail": "Total Number of Customers."
                      },
                      "widget3": {
                        "title": "Total orders",
                        "value": {
                          "used": "1.3 Million",
                          "total": "",
                          "percentage": 6.31
                        },
                        "detail": "Total Number of Orders."
                      },
                      "widget4": {
                        "title": "Total Active Customers",
                        "value": "0.04 Million",
                        "footnote": "Higher than average",
                        "detail": "This is the back side. You can show detailed information here.",
                        "chart": [
                          {
                            "key": "Latency",
                            "values": [
                              {"x": 8000, "y": 1}
                            ]
                          }
                        ]
                      },
                      "widget5": {
                        "title": "Total Inactive Customers",
                        "value": "0.11 Million",
                        "detail": "This is the back side. You can show detailed information here.",
                        "footnote": "Lower than average"
                      },
                      "widget6": {
                        "title": "Average CPU Usage (Live)",
                        "chart": [
                          {
                            "key": "Average CPU Usage",
                            "values": [
                              {"x": 5, "y": 72},
                              {"x": 10, "y": 26},
                              {"x": 15, "y": 51},
                              {"x": 20, "y": 36},
                              {"x": 25, "y": 66},
                              {"x": 30, "y": 69},
                              {"x": 35, "y": 50},
                              {"x": 40, "y": 35},
                              {"x": 45, "y": 49},
                              {"x": 50, "y": 64},
                              {"x": 55, "y": 37},
                              {"x": 60, "y": 78},
                              {"x": 65, "y": 54},
                              {"x": 70, "y": 8},
                              {"x": 75, "y": 52},
                              {"x": 80, "y": 50},
                              {"x": 85, "y": 56},
                              {"x": 90, "y": 71},
                              {"x": 95, "y": 31},
                              {"x": 100, "y": 37},
                              {"x": 105, "y": 15},
                              {"x": 110, "y": 45},
                              {"x": 115, "y": 35},
                              {"x": 120, "y": 28},
                              {"x": 125, "y": 7},
                              {"x": 130, "y": 36},
                              {"x": 135, "y": 7},
                              {"x": 140, "y": 79},
                              {"x": 145, "y": 12},
                              {"x": 150, "y": 5}
                            ]
                          }
                        ]
                      },
                      "widget7": {
                        "title": "Campaign",
                        "table": {
                          "columns": [
                            {
                              "title": "Campaign Name"
                            },
                            {
                              "title": "Location"
                            },
                            {
                              "title": "Category"
                            },
                            {
                              "title": "Status"
                            }
                          ],
                          "rows": [
                            [
                              {
                                "value": "Buy 1 Get 1",
                                "classes": "text-bold"
                              },
                              {
                                "value": "Karnataka",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "Italian"},
                              {"value": "Running"}
                            ],
                            [
                              {
                                "value": "20% Flat",
                                "classes": "text-bold"
                              },
                              {
                                "value": "Gujarat",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "North"},
                              {"value": "Running"}
                            ],
                            [
                              {
                                "value": "Super Sunday",
                                "classes": "text-bold"
                              },
                              {
                                "value": "Bihar",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "North"},
                              {"value": "Completed"}
                            ],
                            [
                              {
                                "value": "Wednesday Dhamaka",
                                "classes": "text-bold"
                              },
                              {
                                "value": "Andhra",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "South"},
                              {"value": "Completed"}
                            ],
                            [
                              {
                                "value": "Diwali",
                                "classes": "text-bold"
                              },
                              {
                                "value": "ALL",
                                "classes": "text-boxed m-0 green-bg white-fg"
                              },
                              {"value": "North"},
                              {"value": "Running"}
                            ],
                            [
                              {
                                "value": "Valentines Day",
                                "classes": "text-bold"
                              },
                              {
                                "value": "ALL",
                                "classes": "text-boxed m-0 deep-orange-bg white-fg"
                              },
                              {"value": "South"},
                              {"value": "Running"}
                            ]
                          ]
                        }
                      },
                      "widget8": {
                        "title": "Activity",
                        "activities": [
                          {
                            "process" : "Orders in Karnantaka",
                            "type": "Output",
                            "value": "100 %"
                          },
                          {
                            "process" : "Orders in Andhra Pradesh",
                            "type": "Input",
                            "value": "10 %"
                          },
                          {
                            "process" : "Orders in Punjab",
                            "type": "Input",
                            "value": "5 %"
                          },
                          {
                            "process" : "Orders in Gujarat",
                            "type": "Output",
                            "value": "100 %"
                          },
                          {
                            "process" : "Orders in Kerala",
                            "type": "Output",
                            "value": "40 %"
                          },
                          {
                            "process" : "Orders in Madhya Pradesh",
                            "type": "Output",
                            "value": "30 %"
                          }
                        ]
                      }
                    };
                }
            },
            bodyClass: 'dashboard-server'
        });
    }

})();
