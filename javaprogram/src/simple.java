
public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		for(int i=1; i<=5; i++){
//	    
//	 System.out.println(i+" ");
//	    }
//     System.out.println();
//    
//	for (int i=1; i<=6; i++) {
//		for (int j=1; j<=i; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();}
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * * * 
//        ======================================================== =======
//		
//		for(int i=1; i<=5; i++){
//    	for (int j=5; j>=i; j-- ) {
//    		System.out.print("* ");
//    	}
//    	System.out.println();
//    }

//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
//  =========================================================================
	/*   for(int i=1;i<=5;i++) {
		   for (int j=5; j>=1;j--)
		      {if(i>=j);{
			   System.out.print("*");
		      }
		      else
		      {  System.out.print(" ");
		      }
		      }
		   System.out.println();
	   
	}*/



		
// 		  5 4 3 2 1
//	i=1	   		  *
//	i=2	        * *
//	i=3	      * * *
//	i=4	    * * * *
//	i=5	  * * * * *
//	-----------------------------------------------------------------
//		for(int i=1; i<=6; i++){
//	    	for (int j=6; j>=i; j-- ) {
//	    		System.out.print(j+" ");
//	    	}
//	    	System.out.println();
//	    }
	/*	6 5 4 3 2 1 
		6 5 4 3 2 
		6 5 4 3 
		6 5 4 
		6 5 
		6 
	*/	
//		for(int i=1; i<=6; i++){
//	    	for (int j=6; j>=i; j-- ) {
//	    		System.out.print(i+" ");
//	    	}
//	    	System.out.println();
//	    }
//		1 1 1 1 1 1 
//		2 2 2 2 2 
//		3 3 3 3 
//		4 4 4 
//		5 5 
//		6 
		
		
//		for(int i=1; i<=6; i++){
//	    	for (int j=1; j<=i; j++ ) {
//	    		System.out.print(i+" ");
//	    	}
//	    	System.out.println();
//	    }
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 
//		6 6 6 6 6 6 
		
//		for(int i=1; i<=6; i++){
//	    	for (int j=1; j<=i; j++ ) {
//	    		System.out.print(j+" ");
//	    	}
//	    	System.out.println();
//	    }
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 5 6 

//		for(int i=1; i<=6; i++){
//	    	for (int j=1; j<=i; j++ ) {
//	    		System.out.print(i+" ");
//	    	}
//	    	System.out.println();
//	    }
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 
//		6 6 6 6 6 6 
		
//	
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((i*j)+" ");
//			}
//			System.out.println();
//			
//	}	
//		1
//		2 4
//		3 6 9
//		4 8 12 16
//		5 10 15 20 25
//    ========== ========== ================ ==========
		 
//		 int k=1;
//         for (int i=1;i<=5;i++) {
//        	 for (int j=1; j<=5;j++) {
//        		 System.out.print((k*j)+" "); 
//      		 without taking another variable print (i*j)    will give same result
//        	 }
//      	 k++;
//         System.out.println();
//		 
//         }
//	 
//		1 2 3 4 5
//		2 4 6 8 10
//		3 6 9 12 15
//		4 8 12 16 20
//      5 10 15 20 25 
//	-------------------===----------------------------=====-----------------
//		int k=1;
//		for(int i=1;i<=5;i++) 
//	{
//		for(int j=1;j<=5;j++)
//	{		 System.out.print((k)+" ");
//	      k+=2;
//	}       System.out.println();
//		}
		
//		1 3 5 7 9 
//		11 13 15 17 19 
//		21 23 25 27 29 
//		31 33 35 37 39 
//		41 43 45 47 49 
//       ======== ============ ======= ============ ===========
	
//		int k=2;   
//		for(int i=1;i<=4;i++)
//		{ for (int j=1; j<=4; j++)
//		{ System.out.print(k+" ");
//		 k+=2;
//		}System.out.println();
//	}
//		2 4 6 8 
//		10 12 14 16 
//		18 20 22 24 
//		26 28 30 32 
 
//		=========== ========== ============= ============ ==
		 
		
		
		/*	 int z= 64 ;int x =96;
		 for (int i=1;i<=5;i++) {
		  for (int j=1 ; j<=i;j++) {
			  if(i % 2==0) {
				  System.out.print((char)(z+i));
			  }else {
				  System.out.print((char)(x+i));
			  }}			
			    System.out.println();		  
		 } 
		 }*/
		/* char c= 'a';
		 for (int i=1; i<=5;i++) {
			 for(int j=1; j<=i; j++) {
				 if(i%2==0) {
					 System.out.print((char)(i+63));
				 }else {
					 System.out.print((char)(i+95));
						 
					 }}
				 System.out.println();
			
			*/	
	/*		
		for(char i='a'; i<='e';i++) {
			for(char j='a';j<=i;j++) {
				System.out.print(j+"");
			}
			System.out.println();
			 }
		*/
//		 === = = = = = = = = = = = = = = = = = = = ==
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<=5;j++) {
//				if(i%2==0) {
//					System.out.print((char)(j+64)+ " ");
//				}else {
//					System.out.print((char)(j+96)+ " ");
//				}
//				
//	     	}
//				System.out.println();
//		}
//		a b c d e 
//		A B C D E 
//		a b c d e 
//		A B C D E 
//		a b c d e 

//		========= = = ======= = = = = = = = = = ==
	
//		for(int i=1;i<=5;i++) {
//			for(int j=1; j<=i;j++) {
//				if(i%2==0) {
//					System.out.print((char)(j+64)+ " ");
//				}else {
//					System.out.print((char)(j+96)+ " ");
//				}
//				
//	     	}
//				System.out.println();
//		}
//		a 
//		A B 
//		a b c 
//		A B C D 
//		a b c d e 

//		
//		 = = = =  =  =  =   =   =   =    =
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i;j++) {
				if(i%2==0) {
					System.out.print((char)(j+96)+ " ");
				}else {
					System.out.print((char)(j+64)+ " ");
				}
				
	     	}
				System.out.println();
		}
//		A 
//		a b 
//		A B C 
//		a b c d 
//		A B C D E 
//            =================================================================
//		int num = 2;
//	
//			if (num != 1) {
//		
//					System.out.println("num not equal to 1");
//				} else {
//					System.out.println("num is equal to 1");
//				}
	
//		for(int i=0; i<4; i++) {
//			for(int k=0; k<=5-i; k++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

	}}

		 
		 
		 
	
	
   


   