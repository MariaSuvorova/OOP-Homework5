package Homework5.presenters;

import Homework5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение списка всех столиков
     * @return
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Изменение брони столика
     * @param oldReservation Номер прежней брони
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер новой брони
     */
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
