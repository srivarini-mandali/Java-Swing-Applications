/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CertificationAuthority;

import DegreeRequest.DegreeRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renuka
 */
public class CertificationAuthorityDirectory {
    ArrayList<CertificationAuthority> list;
    private List<DegreeRequest> degreeApprovalRequests; // A list to store degree approval requests

    public List<DegreeRequest> getDegreeApprovalRequests() {
        return degreeApprovalRequests;
    }

    // Method to add a degree approval request to the list
    public void addDegreeApprovalRequest(DegreeRequest request) {
        getDegreeApprovalRequests().add(request);
    }

    public CertificationAuthorityDirectory() {
        this.list = new ArrayList<CertificationAuthority>() ;
    }

    public ArrayList<CertificationAuthority> getList() {
        return list;
    }

    public void setList(ArrayList<CertificationAuthority> list) {
        this.list = list;
    }
    
    public CertificationAuthority addCertificationAuthority(String userName,String password,String name)
    {
      CertificationAuthority c = new CertificationAuthority(userName,password,name);
      this.list.add(c) ;
     return c;
    }
    
     public CertificationAuthority findByUserName(String username)
    {
      for(CertificationAuthority c:this.list)
      {
        if(c.getUserName().equals(username))
        {
        return c ;
        }
      }
      return null ;
    }

    /**
     * @param degreeApprovalRequests the degreeApprovalRequests to set
     */
    public void setDegreeApprovalRequests(List<DegreeRequest> degreeApprovalRequests) {
        this.degreeApprovalRequests = degreeApprovalRequests;
    }
    
}
