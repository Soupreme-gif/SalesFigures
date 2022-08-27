package edu.wctc.salesfigures;


import edu.wctc.Consoleoutput.Messenger;
import edu.wctc.interfaces.IMessenger;
import edu.wctc.interfaces.ISalesReport;
import edu.wctc.interfaces.IShippingPolicy;
import edu.wctc.shippingPolicies.FreeShipping;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class SalesApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(SalesApplication.class);
        context.refresh();

        SalesManager salesManager = (SalesManager) context.getBean("salesManager");
        salesManager.displayMenu();

    }
    @Bean IShippingPolicy iShippingPolicy()
    {
        return new FreeShipping();
    }

    @Bean ISalesReport iSalesReport(){

        return new SalesReport();
    }

    @Bean IMessenger iMessenger()
    {
        return new Messenger();
    }

}


