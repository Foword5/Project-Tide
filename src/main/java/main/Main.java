package main;

import domain.service.PortUseCase;
import adapters.primary.ui.Controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

import javax.swing.SwingUtilities;
import adapters.primary.ui.vu.FenetreMere; // Adjust the package name as necessary

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PortUseCase portUseCase = context.getBean(PortUseCase.class);
        Controller.setPortUseCase(portUseCase);
        // Use portUseCase here

        // Start the FenetreMere
        SwingUtilities.invokeLater(() -> {
            FenetreMere fenetreMere = null;
            try {
                fenetreMere = new FenetreMere(portUseCase);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            fenetreMere.setVisible(true);
        });
    }
}