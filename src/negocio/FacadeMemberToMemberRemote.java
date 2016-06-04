/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import integracion.LoginPayPalResponse;
import integracion.LoginRequest;
import javax.ejb.Remote;

/**
 *
 * @author Sid
 */
@Remote
public interface FacadeMemberToMemberRemote {

    String Hello();

    LoginPayPalResponse LoginPayPal(LoginRequest request);
    
}
