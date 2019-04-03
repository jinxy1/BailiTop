 // 基于准备好的dom，初始化echarts实例
 var myChart1 = echarts.init(document.getElementById('TrainingTestFigure'));

option1 = {
    title : {
        text: '平均成绩',
        subtext: '纯属虚构',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: ['公司级考试','部门级考试','职称晋级考试','储备成绩','百利读书会','新员工两周集训']
    },
    series : [
        {
            name: '访问来源',
            type: 'pie',
            radius : '55%',
            center: ['60%', '60%'],
            data:[
                {value:35, name:'公司级考试'},
                {value:30, name:'部门级考试'},
                {value:34, name:'职称晋级考试'},
                {value:35, name:'储备成绩'},
                {value:33, name:'百利读书会'},
                {value:58, name:'新员工两周集训'}
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};

// 使用刚指定的配置项和数据显示图表。
        myChart1.setOption(option1);