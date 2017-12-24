$(function(){
	//solving the active menu problem
	switch(menu) {
	
	case 'About Us' :
		$('#about').addClass('active');
		break;
	 
	case 'Contact Us' :
		 $('#contact').addClass('active');
		 break; 
		 
	case 'View Vegetable' :
		 $('#viewVegetable').addClass('active');
		 break;	 
		 
		 
	default :
		 $('#viewVegetable').addClass('active');
		 $('#a_'+menu).addClass('active');
	   	 break;
	
	}
	 
});