package Homework5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import Homework5.presenters.Model;

public class TableModel implements Model {


    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Поменять бронь столика
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        System.out.printf("Бронь %d отменена.\n", oldReservation);
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }
        //TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    }


