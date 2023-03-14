package com.coffeesimulator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CoffeeSimulator
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int water_available = 5000;
		int milk_available = 5000;
		int sugar_available = 3000;
		int coffee_available = 3000;
		int cup_available = 50;
		
//		int cost_of_expreso = 100;
//		int cost_of_capaccino = 150;
//		int cost_of_latte = 200;

		int main_menu_exit = 1;

		while(main_menu_exit==1)
		{
			System.out.println("Main Menu : ");		
			System.out.println("1. Buy Coffee");
			System.out.println("2. Fill Ingredients");
		
			int main_menu_choice = Integer.parseInt(br.readLine());

			switch(main_menu_choice)
			{
				case 1:
					int coffee_menu_exit = 1;
					
					int coffee_needed=0;

					int expresso_quantity=0;
					int capaccino_quantity=0;
					int latte_quantity=0;
					int new_expresso_quantity=0;
					int new_capaccino_quantity=0;
					int new_latte_quantity=0;
	
					int total_bill = 0;

					while(coffee_menu_exit == 1)
					{
						System.out.println("\nCoffee Menu : ");
						System.out.println("1. expresso - RS.100");
						System.out.println("2. capaccino - RS.150");
						System.out.println("3. latte - RS.200");
						//System.out.println("0. Back to Main Menu");

						int coffee_menu_choice = Integer.parseInt(br.readLine());

						int milk_needed = 150;
						int water_needed = 50;
						int sugar_needed = 20;
						int cup_needed = 1;

						int expresso_price = 100;
						int capaccino_price = 150;
						int latte_price = 200;

						
						switch(coffee_menu_choice)
						{
							case 1:
								coffee_needed = 10;
								System.out.println("How much cup Expresso?");
								expresso_quantity = Integer.parseInt(br.readLine());
								new_expresso_quantity += expresso_quantity;
								if(milk_available >= (milk_needed*expresso_quantity))
								{
									if(water_available >= (water_needed*expresso_quantity))
									{
										if(sugar_available >= (sugar_needed*expresso_quantity))
										{
											if(coffee_available >= (coffee_needed*expresso_quantity))
											{
												if(cup_available >= (cup_needed*expresso_quantity))
												{
													milk_available -= (milk_needed*expresso_quantity);
													water_available -= (water_needed*expresso_quantity);
													sugar_available -= (sugar_needed*expresso_quantity);
													coffee_available -= (coffee_needed*expresso_quantity);
													cup_available -= (cup_needed*expresso_quantity);
													break;	
												}
												else
												{
													System.out.println("Needed cup quantity is not available. Please Fill first.");
													break;
												}
											}
											else
											{
												System.out.println("Needed coffee quantity is not available. Please Fill first.");
												break;
											}
										}
										else
										{
											System.out.println("Needed sugar quantity is not available. Please Fill first.");
											break;
										}
									}
									else
									{
										System.out.println("Needed water quantity is not available. Please Fill first.");
										break;
									}
								}
								else
								{
									System.out.println("Needed milk quantity is not available. Please Fill first.");
									break;
								}
							case 2:
								coffee_needed = 15;
								System.out.println("How much cup Capaccino?");
								capaccino_quantity = Integer.parseInt(br.readLine());
								new_capaccino_quantity += capaccino_quantity;
								if(milk_available >= (milk_needed*capaccino_quantity))
								{
									if(water_available >= (water_needed*capaccino_quantity))
									{
										if(sugar_available >= (sugar_needed*capaccino_quantity))
										{
											if(coffee_available >= (coffee_needed*capaccino_quantity))
											{
												if(cup_available >= (cup_needed*capaccino_quantity))
												{
													milk_available -= (milk_needed*capaccino_quantity);
													water_available -= (water_needed*capaccino_quantity);
													sugar_available -= (sugar_needed*capaccino_quantity);
													coffee_available -= (coffee_needed*capaccino_quantity);
													cup_available -= (cup_needed*capaccino_quantity);
													break;	
												}
												else
												{
													System.out.println("Needed cup quantity is not available. Please Fill first.");
													break;
												}
											}
											else
											{
												System.out.println("Needed coffee quantity is not available. Please Fill first.");
												break;
											}
										}
										else
										{
											System.out.println("Needed sugar quantity is not available. Please Fill first.");
											break;
										}
									}
									else
									{
										System.out.println("Needed water quantity is not available. Please Fill first.");
										break;
									}
								}
								else
								{
									System.out.println("Needed milk quantity is not available. Please Fill first.");
									break;
								}
							case 3:
								coffee_needed = 18;
								System.out.println("How much cup Latte?");
								latte_quantity = Integer.parseInt(br.readLine());
								new_latte_quantity += latte_quantity;
								if(milk_available >= (milk_needed*latte_quantity))
								{
									if(water_available >= (water_needed*latte_quantity))
									{
										if(sugar_available >= (sugar_needed*latte_quantity))
										{
											if(coffee_available >= (coffee_needed*latte_quantity))
											{
												if(cup_available >= (cup_needed*latte_quantity))
												{
													milk_available -= (milk_needed*latte_quantity);
													water_available -= (water_needed*latte_quantity);
													sugar_available -= (sugar_needed*latte_quantity);
													coffee_available -= (coffee_needed*latte_quantity);
													cup_available -= (cup_needed*latte_quantity);
													break;	
												}
												else
												{
													System.out.println("Needed cup quantity is not available. Please Fill first.");
													break;
												}
											}
											else
											{
												System.out.println("Needed coffee quantity is not available. Please Fill first.");
												break;
											}
										}
										else
										{
											System.out.println("Needed sugar quantity is not available. Please Fill first.");
											break;
										}
									}
									else
									{
										System.out.println("Needed water quantity is not available. Please Fill first.");
										break;
									}
								}
								else
								{
									System.out.println("Needed milk quantity is not available. Please Fill first.");
									break;
								}
							default:
								System.out.println("There is no coffee for this option..."); 
																
						}

						total_bill = ((expresso_price*new_expresso_quantity) + (capaccino_price*new_capaccino_quantity) + (latte_price*new_latte_quantity));
						System.out.println("\nDo u want to exit from Buying Coffee menu : Yes-0/No-1 ");
						coffee_menu_exit = Integer.parseInt(br.readLine());

						if(coffee_menu_exit != 1 && total_bill > 0)
						{
							System.out.println("\t\t...LTRCAFFEE...\n");

							System.out.println("Coffee\t\tPrice\t\tQuantity\tBill\n");
							System.out.println("Expresso\t" + expresso_price + " \t\t" + new_expresso_quantity +" \t\t" + (expresso_price*new_expresso_quantity));
							System.out.println("Capaccino\t" + capaccino_price + " \t\t" + new_capaccino_quantity + " \t\t" +(capaccino_price*new_capaccino_quantity));
							System.out.println("Latte \t\t" + latte_price + " \t\t" + new_latte_quantity +" \t\t" + (latte_price*new_latte_quantity));
							
							System.out.println("\nTotal Price : " + total_bill);
							
							System.out.println("\n\t Thank You...Visit Again...\t\n");
							break;
						}
					}
					break;					

				case 2:
					int ingred_menu_exit = 1;
					while(ingred_menu_exit == 1)
					{
						System.out.println("\nIngredients Menu : ");
						System.out.println("1. Water");
						System.out.println("2. Milk");
						System.out.println("3. Sugar");
						System.out.println("4. Coffee");
						System.out.println("5. Cup");
						System.out.println("6. Ingredient Report");
						//System.out.println("0. Back to Main Menu");

						int ingred_menu_choice = Integer.parseInt(br.readLine());

						switch(ingred_menu_choice)
						{
							
							case 0:
								break;
							case 1:
								System.out.println("Available Water Level : "+water_available+"ML. Maximum Level : 5000 ML");
								System.out.println("How much Water you want to Add in ML : ");
								int added_water = Integer.parseInt(br.readLine());
								
								if(added_water > 5000 || (water_available+added_water) > 5000)
								{
									System.out.println("Available Water Level : "+ water_available +" ML. Maximum Level : 5000 ML");
									break;
								}
								else
								{
									water_available += added_water;
									System.out.println("Water Added Successfully...");
									break;
								}

							case 2:
								System.out.println("Available Milk Level : "+ milk_available +" ML. Maximum Level : 5000 ML");
								System.out.println("How much Milk you want to Add in ML : ");
								int added_milk = Integer.parseInt(br.readLine());
								
								if(added_milk > 5000 || (milk_available+added_milk) > 5000)
								{
									System.out.println("Available Milk Level : "+ milk_available +" ML. Maximum Level : 5000 ML");
									break;
								}
								else
								{
									milk_available += added_milk;
									System.out.println("Milk Added Successfully...");
									break;
								}
							case 3:
								System.out.println("Available Sugar Level : "+ sugar_available +" ML. Maximum Level : 3000 GM");
								System.out.println("How much sugar you want to Add in GM : ");
								int added_sugar = Integer.parseInt(br.readLine());
								
								if(added_sugar > 3000 || (sugar_available+added_sugar) > 3000)
								{
									System.out.println("Available Sugar Level : "+ sugar_available +" ML. Maximum Level : 3000 GM");
									break;
								}
								else
								{
									sugar_available += added_sugar;
									System.out.println("Sugar Added Successfully...");
									break;
								}
							case 4:
								System.out.println("Available Coffee Level : "+ coffee_available +" ML. Maximum Level : 3000 GM");
								System.out.println("How much coffee you want to Add in GM: ");
								int added_coffee = Integer.parseInt(br.readLine());
								
								if(added_coffee > 3000 || (coffee_available+added_coffee) > 3000)
								{
									System.out.println("Available coffee Level : "+ coffee_available +" ML. Maximum Level : 3000 GM");
									break;
								}
								else
								{
									coffee_available += added_coffee;
									System.out.println("Coffee Added Successfully...");
									break;
								}
							case 5:
								System.out.println("Available Cup's : "+ cup_available +" Units. Maximum Level : 50 Unit");
								System.out.println("How much Cup's you want to Add in Units : ");
								int added_cup = Integer.parseInt(br.readLine());
								
								if(added_cup > 50 || (cup_available+added_cup) > 50)
								{
									System.out.println("Available Cup's : "+ cup_available +" Units. Maximum Level : 50 Units");
									break;
								}
								else
								{
									cup_available += added_cup;
									System.out.println("Cup Added Successfully...");
									break;
								}
							case 6:
								System.out.println("\t\t...Ingredients Report...\n");
								System.out.println("Ingredients\tAvailable\tUsed\tMaximum_Capacity\n");
								System.out.println("Water \t\t"+water_available+" \t\t"+(5000-water_available)+"\t 5000 ML\n");
								System.out.println("Milk \t\t"+milk_available+" \t\t"+(5000-milk_available)+"\t 5000 ML\n");
								System.out.println("Sugar \t\t"+sugar_available+" \t\t"+(3000-sugar_available)+"\t 3000 GM\n");
								System.out.println("Coffee \t\t"+coffee_available+" \t\t"+(3000-coffee_available)+"\t 3000 GM\n");
								System.out.println("Cup \t\t"+cup_available+" \t\t"+(50-cup_available)+"\t 50 Units\n");
								break; 
							default:
								System.out.println("Please Enter Correct Choice..."); 

						}

						System.out.println("\nDo u want to exit from ingredients menu : Yes-0/No-1 ");
						ingred_menu_exit = Integer.parseInt(br.readLine());
				
					}
					break;
				default:
					System.out.println("Please Enter Correct Choice..."); 
			} 

			System.out.println("\nDo u want to exit from main menu : Yes-0/No-1 ");
			main_menu_exit = Integer.parseInt(br.readLine());


		}
		

	}
}