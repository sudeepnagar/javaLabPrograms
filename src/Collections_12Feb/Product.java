package Collections_12Feb;

public record Product(Integer pId,String pName) {
         public Product 
         {
			if(pId<=0) {
				throw new IllegalArgumentException("Id should be positive");
			}
		}
}
