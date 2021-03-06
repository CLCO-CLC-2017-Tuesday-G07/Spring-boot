<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Icsse7 News</title>
	<link href="/resources/CSS/bootstrap.css" rel="stylesheet"></link>
	<link href="/resources/CSS/app.css" rel="stylesheet"></link>
	<script src="//cdn.ckeditor.com/4.6.2/standard/ckeditor.js"></script>
	<script type="text/javascript">
		var openFile = function(event) {
			if (CKEDITOR.instances['body']) {
				CKEDITOR.instances['body'].destroy();	
			}
		    var input = event.target;
			var body = document.getElementById('body');
			body.value = "";
		    var reader = new FileReader();
		    reader.onload = function(){
		      var text = reader.result;
		      body.value = reader.result;
		    };
		    reader.readAsText(input.files[0]);
		    CKEDITOR.replace('body');
	  	};
	</script>	
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body>
<center>
<div class="panel panel-default">
			
			<div class="panel-heading"><span class="lead">Upload News</span></div>
			<div class="uploadcontainer">
				<form method="POST" action="/edit" enctype="multipart/form-data" class="form-horizontal">
			
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="file">Upload a document</label>
							<div class="col-md-7">
								<input type="file"  onchange='openFile(event)' path="file" id="file" class="form-control input-sm"/>
								<div class="has-error">
									<errors path="file" class="help-inline"/>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-3 control-lable" for="file">Description</label>
							<div class="col-md-7">
								<input type="text" path="description" id="description" name="description" class="form-control input-sm"/>
							</div>
							
						</div>
					</div>
			
					<div class="row">
						<textArea id="body" style="display:none;" name="body">
	 					</textArea>
						<div class="form-actions floatRight">
							<input type="submit" value="Upload" class="btn btn-primary btn-sm">
						</div>
					</div>
	
				</form>
				</div>
		</div>
	 	
   	</div>
   	</center>
</body>
</html>