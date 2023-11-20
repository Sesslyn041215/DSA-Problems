

	public abstract class Polygon {
		
		protected int noOfSides;
		
		public int getNoOfSides() {
			return noOfSides;
		}

		public void setNoOfSides(int noOfSides) {
			this.noOfSides = noOfSides;
		}

		public abstract double calculateArea();
		public abstract double circumference();

		// ADD CODE here as necessary to initialize Polygon
		public Polygon(int noOfSides){
	
			this.noOfSides = noOfSides;
		}						
		
	}


