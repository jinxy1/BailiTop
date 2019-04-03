 // 基于准备好的dom，初始化echarts实例
 var myChart = echarts.init(document.getElementById('DailyDataFigure'));
 
option = {
    title : {
        text: '考勤',
        
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:['请假','迟到','加班']
    },
    toolbox: {
        show : true,
        feature : {
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'请假',
            type:'bar',
            data:[0, 2, 0, 0, 0, 1, 1.38, 0, 1.25, 0.5, 0, 0],
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'},
                    {type : 'min', name: '最小值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        },
         {
            name:'加班',
            type:'bar',
            data:[16,	32	,32	,0	,24,	0,	40	,48,	16,	8	,24	,0],
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'},
                    {type : 'min', name: '最小值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        },
        {
            name:'迟到',
            type:'bar',
            data:[0,0,0,0,0,0,0,0,0,0,0,0,],
            markPoint : {
                data : [
                    {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183},
                    {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name : '平均值'}
                ]
            }
        }
    ]
};
// 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);