/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import entities.Grupo;
import entities.Usuario;
import java.io.Serializable;

/**
 *
 * @author Sid
 */
public class MailMessage implements Serializable {
    public Usuario usuario;
    public Grupo grupo;

    public MailMessage(Usuario usuario, Grupo grupo) {
        this.usuario = usuario;
        this.grupo = grupo;
    }
    
    
}
