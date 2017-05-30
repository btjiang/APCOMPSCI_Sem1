public String AttackResponse(String input)
	{
		String input = "";
		input = input.trim();
		System.out.println(Guess point);
		if (input = one of the array numbers)
		{
			return "Hit!!"; 
		}
		
		else 
		{
			return "Miss";
		}
		
	}
	
	
		public String Attack(int ship)
	{
		int ship = 1 + (int)(Math.random()*99);
		System.out.println("Attack" + ship);
		Scanner kb = new Scanner(System.in);
		String response = kb.nextLine();
		response = response.trim.toLowerCase();
		if (response.equals("hit"))
		{
			health -=health;
			return "Oh no!";
		}
		
		else
		{
			return "Yay!";
		}
		
	}