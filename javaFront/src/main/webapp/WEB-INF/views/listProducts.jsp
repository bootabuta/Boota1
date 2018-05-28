<div class="container">
	<div class="row">
	   
	   <!-- Losding the sidebar  -->
		<div class="col-md-3">
		
			 <%@include file="./shared/sidebar.jsp" %>
		
		</div>	
		
		<!-- Loading the actual Products  -->
		<div class="col-md-9">
		<br>
			<!-- Loading the Breadcrum  -->
			<div class="row">
			
				<div class="col-xs-12">
				    
				    <c:if test="${userClickAllProducts == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
						
							<li><a href="${contextRoot}/home">Home / </a></li>
							<li class="active">All Products</li>
						
						</ol>
						
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
						
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active"> / category</li>
							<li class="active"> / ${category.name}</li>
						
						</ol>
						
					</c:if>
					
			</div>	
			</div>	
		 <div class="row">
		 <div class="col">			
		<table id="productListTable" class="table table-striped table-borderd">			
			<thead> 			
				<tr>
					<th></th>
					<th>Name</th>
					<th>Brand</th>
					<th>Price</th>
					<th>Avail Quan.</th>
					<th> </th>
					
					</tr>
					
					</thead>
					
					</table>
					
					
				</div>
			
			</div>
		
		</div>
			
	</div>

</div>