package io.valhala.main;

public class Client
	{
		private String firstName, lastName, email, street, city, zip, state, homePhone, mobilePhone, notes;

		public Client(String firstName, String lastName, String email, String street, String city, String zip, String state,
				String homePhone, String mobilePhone, String notes)
		{
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setEmail(email);
			this.setStreet(street);
			this.setCity(city);
			this.setZip(zip);
			this.setHomePhone(homePhone);
			this.setMobilePhone(mobilePhone);
			this.setNotes(notes);
			
		}
		
		public Client()
		{
			
		}
		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the street
		 */
		public String getStreet() {
			return street;
		}
		/**
		 * @param street the street to set
		 */
		public void setStreet(String street) {
			this.street = street;
		}
		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}
		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}
		/**
		 * @return the zip
		 */
		public String getZip() {
			return zip;
		}
		/**
		 * @param zip the zip to set
		 */
		public void setZip(String zip) {
			this.zip = zip;
		}
		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}
		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}
		/**
		 * @return the homePhone
		 */
		public String getHomePhone() {
			return homePhone;
		}
		/**
		 * @param homePhone the homePhone to set
		 */
		public void setHomePhone(String homePhone) {
			this.homePhone = homePhone;
		}
		/**
		 * @return the mobilePhone
		 */
		public String getMobilePhone() {
			return mobilePhone;
		}
		/**
		 * @param mobilePhone the mobilePhone to set
		 */
		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}
		/**
		 * @return the notes
		 */
		public String getNotes() {
			return notes;
		}
		/**
		 * @param notes the notes to set
		 */
		public void setNotes(String notes) {
			this.notes = notes;
		}
		
		public String toString()
		{
			String result = "First Name: " + this.getFirstName() + "\n" + "Last Name: " + this.getLastName() + "\n" + "Email: " + this.getEmail() +
					"\n" + "Street: " + this.getStreet() + "\n" + "City: " + this.getCity() + "\n" + "Zip: " + this.getZip() +
					"\n" + "State: " + this.getState() + "\n" + "Home phone: " + this.getHomePhone() + "\n" + "Mobile Phone: " + this.getMobilePhone() + "\n" + "Notes: " + this.getNotes();
			return result;
		}
	}