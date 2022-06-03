public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int priceTicket = 5005;
        int totalMiles = service.calculate(priceTicket);
        System.out.println(totalMiles);


    }
}