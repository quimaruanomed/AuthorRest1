package com.example.AuthorRest1;

	public class Author {
		
		private int id;
		public String name;
		public String country;
		public int dob;
		public int qtyAuthor;
		public Boolean alive;



		public Author() {
			super();
		}

		public Author(int id, String name, String country, int dob, int qtyAuthor, Boolean alive) {
			super();
			this.id = id;
			this.name = name;
			this.country = country;
			this.dob = dob;
			this.qtyAuthor = qtyAuthor; //??
			this.alive = alive;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getDob() {
			return dob;
		}
		public void setDob(int dob) {
			this.dob = dob;
		}
		public int getQtyAuthor() {
			return qtyAuthor;
		}
		public void setQtyAuthor(int qtyAuthor) {
			this.qtyAuthor = qtyAuthor;
		}
		public Boolean getAlive() {
			return alive;
		}
		public void setAlive(Boolean alive) {
			this.alive = alive;
		}

		@Override
		public String toString() {
			return "Author [id=" + 1 + ", name=" + name + ", country=" + country + ", dob=" + dob + ", qtyBooks=" + qtyAuthor
					+ ", Boolean=" + alive + "]";
		}

	}

