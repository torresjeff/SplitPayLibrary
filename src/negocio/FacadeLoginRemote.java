/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DTO.LoginSplitPayRequest;
import DTO.LoginSplitPayResponse;
import javax.ejb.Remote;

/**
 *
 * @author Sid
 */
@Remote
public interface FacadeLoginRemote {

    LoginSplitPayResponse Login(LoginSplitPayRequest request);
    
}
