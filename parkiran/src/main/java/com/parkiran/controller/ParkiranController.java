/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.parkiran.controller;
import com.parkiran.repository.ParkiranRepository;
import java.util.Scanner;
import org.springframework.beana.factory.annotation.Autowired;
import org.springframwork.stereotype.Controller;
/**
 *
 * @author Jun
 */
@Controller
public class ParkiranController {
    @Autowired
    private ParkiranRepository parkiranRepository;
    
    public void tampilkanMenu(){
        Scanner scanner = new Scanner(System.in);
        int opsi;
        do{
            System.out.println("\n------Menu Parkiran------");
            System.out.println("1. Masuk Parkir");
            System.out.println("2.Keluar Parkir");
            System.out.println("3.Exit Program");
            opsi = scanner.nextInt();
            scanner.nextLine();
            
            switch (opsi){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("1");
                    break;
                case 3:
                    System.out.println("1");
                    break;
                default:
                   System.out.println("opsi Tidak Valid");
            }
            
        }while (opsi !=3);
    }
    private void masukParkir(Scanner scanner){
        System.out.println("Masukan Plat Nomor: ");
        String platNomor = scanner.nextLine();
        System.out.println("Masukan Jenis Kendaraan: ");
        int jenisKendaraan = scanner.nextInt();
        
        ModelParkiran parkiran = new ModelParkiran(platNomor, LocalDateTime.now(), jenisKendaraan);
        parkiranRepository.save(parkiran):
}
