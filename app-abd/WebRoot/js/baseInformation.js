            /* 基本信息 */
   $(function(){
	    $('#BaseInformation').click(function(){
	         $.ajax({
	             type: "post",
	             url: "ToIndex.do",
	             data: {staffCode:14062304},
	             dataType: "json",
	             success: function(data){
	            	 console.log(data);
	                   
	                      }
	         });
	    });
	    
	
	  
	     });

    

