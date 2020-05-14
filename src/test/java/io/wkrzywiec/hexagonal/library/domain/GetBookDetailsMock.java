package io.wkrzywiec.hexagonal.library.domain;

import io.wkrzywiec.hexagonal.library.TestData;
import io.wkrzywiec.hexagonal.library.domain.book.model.BookDetailsDTO;
import io.wkrzywiec.hexagonal.library.domain.book.ports.incoming.GetBookDetails;

import java.util.HashMap;
import java.util.Map;

public class GetBookDetailsMock implements GetBookDetails {

    private Map<String, BookDetailsDTO> bookDetails;

    public GetBookDetailsMock() {
        bookDetails = new HashMap<String, BookDetailsDTO>();
        bookDetails.put(TestData.homoDeusBookDetailsDTO().getBookExternalId(), TestData.homoDeusBookDetailsDTO());
    }

    @Override
    public BookDetailsDTO handle(String bookId) {
        return bookDetails.get(bookId);
    }
}