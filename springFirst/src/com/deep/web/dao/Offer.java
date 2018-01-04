package com.deep.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.deep.web.validator.ValidEmail;

public class Offer {

		private int id;
		@Size(max=15,min=3 ,message="name must be between 3 to 15 characters")
		private String name;

		@NotNull
		//@Pattern(regexp=".*\\@.*\\..*",message="please add valid email")
		@ValidEmail
		private String email;
		
		@Size(max=100,min=10 ,message="text must be between 10 to 100 characters")
		private String text;
		
		public Offer(){
		}
		public Offer(String name,String email,String text){
			this.name = name;
			this.email = email;
			this.text = text;
		}
		
		public Offer(int id,String name,String email,String text){
			this.id = id;
			this.name = name;
			this.email = email;
			this.text = text;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		
		public String toString(){
			return " id:- "+id+" name:- "+name+" email:- "+email+" text:- "+text;
		}
		
}
