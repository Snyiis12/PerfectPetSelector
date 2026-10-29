// Rules:
// Those who prefer blue as a color and whose favorite season is fall should receive an alligator as their pet.
//Those who prefer blue as a color and whose favorite season is spring should receive an ostrich as their pet.
//If you like green as a color and your name starts with a consonant and your favorite season is winter you should get a giraffe.
//If you like green and your favorite season is anything other than fall then a dog is right for you, unless you already got a giraffe.
//Anyone who prefers red should receive a panda, unless their name starts with a vowel, then they should get a porcupine.
//Ponies are perfect for those who like summer, unless of course they are already getting a dog or a panda or a porcupine.
//Those whose name starts with a consonant and who like blue and whose favorite season is neither summer nor fall
//should be getting an axolotl, unless they’ve already gotten an ostrich.
//Anyone who hasn’t qualified for one of the pets above should receive a pet rock.

//color = blue & fall = alligator 
//color = blue & spring = ostrich 
//color = green & name starts with consonant & winter = alligator
//color = green & !fall & !giraffe = dog
//color = red &Name doesnt start with vowel = panda
//color = red &Name does start with vowel = porcupine
//favorite is summer and !dog || !panda || !porcupine = Ponies
//name start !vowel & color = blue * season == !summer || !fall & !ostrich = axolotl
//!cannot get anything = rock

//Copied from https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter your favorite color");
    String colors = myObj.nextLine();
    String color = colors.trim().toLowerCase();
    if (!color.equals("blue") && !color.equals("green") && !color.equals("red")) {
      System.out.println("Color is Invalid. Please enter blue, green, or red.");
      myObj.close();
      return;
    } else {
      System.out.println("Color is Valid");
    }
    System.out.println("Enter your favorite season");
    String seasons = myObj.nextLine();
    String season = seasons.trim().toLowerCase();
    if (!season.equals("spring") && !season.equals("summer") && !season.equals("fall") && !season.equals("winter")) {
      System.out.println("Season is Invalid. Please enter spring, summer, fall, or winter.");
      myObj.close();
      return;
    } else {
      System.out.println("Season is Valid");
    }
    System.out.println("Enter your name:");
    String names = myObj.nextLine();
    String name = names.trim().toLowerCase();
    if (name.isEmpty() || !Character.isLetter(name.charAt(0))) {
      System.out.println("Name is Invalid. Please enter a name that starts with a letter.");
      myObj.close();
      return;
    }
    // Output input by user
    System.out.println("Color: " + color);
    System.out.println("Season: " + season);
    System.out.println("Name: " + name);
    myObj.close();
      //Aligator
    if ((color.equals("blue")) && (season.equals("fall"))) {
      System.out.println("you should get an alligator as your pet!");
    }//Ostrich
    else if ((color.equals("blue")) && (season.equals("spring"))) {
      System.out.println("you should get an ostrich as your pet!");
    }//Giraffe
    else if (("green".equals(color)) && !("aeiouAEIOU".indexOf(name.substring(0,1))>0) && (season.equals("winter"))) {
        System.out.println("you should get a giraffe as your pet!");
    }//Dog
    else if (("green".equals(color)) && !(season.equals("fall"))) {
    System.out.println("you should get a dog as your pet!");
    }//Panda
    else if (("red".equals(color)) && !("aeiouAEIOU".indexOf(name.substring(0,1))>0)) {
      System.out.println("you should get a panda as your pet!");
    }//Porcupine
    else if (("red".equals(color)) && ("aeiouAEIOU".indexOf(name.substring(0,1))>0)) {
     System.out.println("you should get a porcupine as your pet!");
    }//Pony
    else if ((season.equals("summer") || (season.equals("fall") && !(("green".equals(color)) && !("aeiouAEIOU".indexOf(name.substring(0,1))>0)) && (!("red".equals(color)) && ("aeiouAEIOU".indexOf(name.substring(0,1))>0) && (!("red".equals(color)) && !("aeiouAEIOU".indexOf(name.substring(0,1))>0)))))) {
    System.out.println("you should get a pony as your pet!");
    }//Axolotl
    else if (("blue".equals(color)) && (!("aeiouAEIOU".indexOf(name.substring(0,1))>0) && !(season.equals("fall") && !(season.equals("summer"))))) {
    System.out.println("you should get a axolotl as your pet!");
    }
    else System.out.println("you should get a rock as your pet!");
    }
  }
