/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.FitnessClubManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author luliu
 */
public class FitnessClubManagerOrganization extends Organization {
    public FitnessClubManagerOrganization() {
        super(Organization.Type.FitnessClubManager.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FitnessClubManagerRole());
        return roles;
    }
}
