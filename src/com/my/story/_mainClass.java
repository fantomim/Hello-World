package com.my.story;



public class _mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  // создадим наших героев
	    Hero ourNewHero = (Hero) new FirstHero("Спасити царевну");
	    GreatKing ourKing = new GreatKing("Править мудро", (Hero) new FirstHero("Охранять господина"));
	    LandLord ourNewLandLord = new LandLord("Похитить царевну", (Hero) new FirstHero("Охранять господина"));
	    // Женим нашего короля
	    ourKing.setWife("Несмеяна");
	    // И начнем повествование
	   
	    System.out.println("Жил был мудрый король, и должен был он " + ourKing.getQuest());
	    System.out.println("Была у него жена, и звали ее " + ourKing.getWife());
	    System.out.println("Был в королевстве коварный Визирь и хотел он " + ourNewLandLord.getQuest());
	    System.out.println("И сделал это");
	    String wife = ourKing.getWife(true);
	    //
	    System.out.println("А наш герой жаждал " + ourNewHero.getQuest() + " ..и добился этого");
	    ourKing.setWife(wife);
	    System.out.println("Король был счастлив.");
	    System.out.println(5%12);


	}

}
