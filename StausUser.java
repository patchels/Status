/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
    private enum UserStatus {
        REJECTED,
        PENDING,
        PROCESSING,
        APPROVED
    }
   public void statusDetail(String code)
{
switch(code.toUpperCase())
        {
        case "ZERO": System.out.println("REJECTED");
        break;
        case "ONE": System.out.println("PENDING");
        break;
        case "TWO":
        System.out.println("PROCESSING");
        break;
        case "THREE": 
            System.out.println("APPROVED");
        break;
        default:
         System.out.println("NOT VALID CODE");
        break;
        }
}
 
}
