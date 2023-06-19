package Homework5;

import java.util.Date;

import Homework5.models.TableModel;
import Homework5.presenters.BookingPresenter;
import Homework5.views.BookingView;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  Метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");
        bookingView.reservationTableEvent(new Date(), 105, "Вася");
        bookingView.changeReservationTable(9001, new Date(), 101, "Станислав");
    }

}
