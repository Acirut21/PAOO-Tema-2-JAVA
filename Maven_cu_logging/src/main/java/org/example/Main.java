package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Aplicatia a pornit!");

        try {
            int rezultat = 10 / 0; // Va genera o exceptie
        } catch (Exception e) {
            logger.error("Eroare detectată: ", e);
        }

        logger.warn("Asta este un mesaj de avertizare.");
        logger.debug("Un mesaj pentru debugging.");
        logger.info("Aplicatia se încheie.");
    }
}
