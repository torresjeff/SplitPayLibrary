/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import entities.Grupo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sid
 */
public class GetGroupsResponse extends Response implements Serializable{
    public List<Grupo> grupos = new ArrayList<>();
}
