import java.util.Scanner;
public class PetPlay { //initialize class


//declare instance variables
private String name;
private int age;
private int hunger;
private int clean;
private int happy;

//Constructer
public void pet(){
this.name="";
this.age=0;
this.hunger=100;
this.clean=100;
this.happy=100;

}

//Setters
public void setName(String name){

    this.name=name;
}

public void setAge(int age){

    this.age=age;
}

public void setHunger(int hunger){

    this.hunger=hunger;
}

public void setClean(int clean){

    this.clean=clean;
}

public void setHappy(int happy){

    this.happy=happy;
}

//Getters
public String getName(){

	return name;
}

public int getAge(){

	return age;
}

public int getHunger(){

	return hunger;
}

public int getClean(){

	return clean;
}

public int getHappy(){

	return happy;
}

public void nextDay(){

    this.age++;
    this.hunger-=10;
    this.clean-=10;
    this.happy-=10;

}

public int highRate(){

	return 15;
}

public int medRate(){

	return 10;
}

public int lowRate(){

	return 5;
}

public String allStats(){

 return("Name: "+name+"\nAge: "+age+"\nCleanliness: "+clean+"\nHunger: "+hunger+"\nHappiness: "+happy);

}

//decide what rate to subtract from the pets overall health
public int cleanRate(){


			if(this.clean>75){
				this.clean+=highRate();
				if (this.clean<100){
					return this.clean=90;
				}	
			}
			else if(this.clean<=75){
				return this.clean+=medRate();
			}
			else {
				return this.clean+=lowRate();
			}
			return this.clean;
		}
	
public int hungerRate(){
		
			if(this.hunger>75){
				this.hunger+=highRate();
				if (this.hunger<100){
					return this.hunger=90;		
				}
				return this.hunger;
			}
			else if(this.hunger<=75){
				return this.hunger+=medRate();
			}
			else {
				return this.hunger+=lowRate();
			}
		}
		
public int happyRate(){
		
			if(this.happy>75){
				this.happy+=highRate();
				if (this.happy<100){
					return this.happy=90;
					
				}
			}
			else if(this.happy<=75){
				return this.happy+=medRate();
			}
			else {
				return this.happy+=lowRate();
		
			}
			return this.happy;
		}
		

//Stat Speakers
public String vetHunger(){
	if(this.hunger>75){
		return ("Your pet is well fed. Keep it up!");
		}
	else if(this.hunger<=75){
			return ("Your pet is getting hungry!");
			}
	else {
			return ("Your pet is starving!");
			}
		}



public String vetClean(){
	if(this.clean>75){
		return ("Your pet is well kept. Keep it up!");
		}
	else if(this.clean<=75){
			return ("Your pet is getting dirty!");
			}
	else {
			return ("Your pet has poo on it!!!");
			}
		}



public String vetHappy(){
	if(this.happy>75){
		return ("Your pet is happy. Keep it up!");
		}
	else if(this.happy<=75){
			return ("Your pet is getting sad!");
			}
	else {
			return ("Your pet is crying!");
			}
		}

public String starBars(){
	return "\n****************************************\n****************************************";
}

public String starBar(){
	return "****************************************\n";
}


public String playerGrade(){
	
	if(age>14){
		return "Dang good job man!";
	}
	else if(age>11){
		return "Yeah you tried";
	}
	else{
		return "Woooooow..........";
	}
}
//************************************************************************
//CAN DO A AVERAGE PERFORMANCE BASED ON RUNNING EVERY COMBINATION OF THE GAME AND OUTPUTTING AVG SCORE
public static void main(String[] args){
boolean play = true;
while(play==true){
	Scanner input = new Scanner(System.in);
	PetPlay myPet = new PetPlay();
	myPet.pet();

	System.out.print(myPet.starBars());
	System.out.print(myPet.starBars());
	System.out.println("\nHappy egg day, what is your pets name?");
	String nom = input.nextLine();
	myPet.setName(nom);


	
	while(myPet.clean>0||myPet.hunger>0||myPet.happy>0){
	
		myPet.nextDay();
		System.out.println(myPet.starBars());
		System.out.println("How will you care for your pet?\n\nSelect: \n1 to clean your pet.\n2 to feed your pet.\n3 to walk your pet.");
		System.out.print(myPet.starBar());
		int x=input.nextInt();
		if(x==1){
			myPet.cleanRate();
		}
		else if(x==2){
			myPet.hungerRate();
		}
		else{
			myPet.happyRate();
		}


		
		System.out.println(myPet.starBars());
		System.out.println("\n"+myPet.allStats()+"\n");
		
		System.out.println(myPet.vetClean()+"\n"+myPet.vetHunger()+"\n"+myPet.vetHappy()+"\n");
	if(myPet.clean<=0||myPet.hunger<=0||myPet.happy<=0){
		
		System.out.println(myPet.starBars());
		System.out.println(myPet.starBars());
		System.out.println("Your pet has run away!!\nGAME OVER");
		System.out.println(myPet.playerGrade());
		System.out.println(myPet.starBars());
		System.out.println(myPet.starBars());
		System.out.println("Do you want to play again?\nInput '1' for yes and '0' for no:");
		System.out.println(myPet.starBar());
		int playAgain=input.nextInt();
		if(playAgain==0){
			play=false;
		}

		break;
}
}
}


	
	}//end main

}