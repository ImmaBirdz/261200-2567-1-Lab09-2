public class Main {
      public static void main(String[] args) {
      Xpay xpay = new XpayImpl(); 
      xpay.setCreditCardNo("8794562135468798");     
      xpay.setCustomerName("Marcus Rashford"); 
      xpay.setCardExpMonth("12");
      xpay.setCardExpYear("28"); 
      xpay.setCardCVVNo((short) 124); 
      xpay.setAmount(300000.00); // 300k per week?
      PayD payD = new XpayToPayDAdapter(xpay); 
      testPayD(payD);
    }
    private static void testPayD(PayD payD) {
      System.out.println(payD.getCardOwnerName());        
      System.out.println(payD.getCreditCardNo()); 
      System.out.println(payD.getCardExpMonthYear());
      System.out.println(payD.getCVVNo()); 
      System.out.println(payD.getTotalAmount());
    }
  }