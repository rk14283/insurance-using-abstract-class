package com.example.insurance;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        ArrayList<String> Users = new ArrayList<>();

        ArrayList<String> Insurances = new ArrayList<>();

        System.out.println("Welcome to Star insurance, please select the insurance you want. ");

        //System.out.println("user input is "+ userInput);



            String [] InsuranceInputArr = {"Phone Insurance", "House Insurance", "Car Insurance"};
            System.out.println("1"+" "+InsuranceInputArr[0]);
            System.out.println("2"+" "+InsuranceInputArr[1]);
            System.out.println("3"+" "+InsuranceInputArr[2]);
        Scanner ReadLineUserInput = new Scanner(System.in);
        String userInput = ReadLineUserInput.nextLine();

        if (userInput.equals("1")){
        PhoneInsurance phoneInsurance = new PhoneInsurance("phone insurance");
        phoneInsurance.PhoneInsurancePurchasePrice();
        Insurances.add(phoneInsurance.toString());


        }
        else if(userInput.equals("2")){
        HouseInsurance houseInsurance = new HouseInsurance("house insurance");
        houseInsurance.HouseInsurancePurchasePrice();

        }
        else if(userInput.equals("3")){
            CarInsurance carInsurance = new CarInsurance("car insurance");
            carInsurance.CarInsurancePurchasePrice();
        }
        else{
            System.out.println("Wrong input please enter 1, 2 or 3.");
        }

        System.out.println("Enter email");
        String email = ReadLineUserInput.nextLine();
        System.out.println("Enter IBAN");
        String IBAN = ReadLineUserInput.nextLine();

        System.out.println("Enter name");
        String name = ReadLineUserInput.nextLine();
        User newUser = new User(name, email, IBAN, Insurances);
        System.out.println(newUser);


        //ArrayList<String> AllUsers = new ArrayList<>();
    }
}