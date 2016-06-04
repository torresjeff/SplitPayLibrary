/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import DTO.FinalDebtResponse;
import DTO.GetGroupUsersRequest;
import DTO.GetGroupUsersResponse;
import javax.ejb.Remote;

/**
 *
 * @author Sid
 */
@Remote
public interface FacadeFinalDebtRemote {

    String Hello();

    FinalDebtResponse FinalDebtResolution(DTO.FinalDebtRequest request);

    GetGroupUsersResponse GetGroupUsers(GetGroupUsersRequest request);
    
}
