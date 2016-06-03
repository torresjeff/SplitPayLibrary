/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

/**
 *
 * @author Sid
 */
public class Response implements Serializable {
    public String operationError = null;
    
    public boolean Succeeded() {
        return operationError == null;
    }
}
