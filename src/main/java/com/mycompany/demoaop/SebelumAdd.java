/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demoaop;

import org.apache.log4j.Logger;

/**
 *
 * @author okt19
 */
public class SebelumAdd {
    
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    
    public void sebelumAdd() {
        logger.info("Before aspect berhasil dijalankan...");
    }
}
