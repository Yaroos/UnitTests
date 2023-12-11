package book;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepositoryMock;
    private BookService bookService;

    @Before
    public void setUp() {
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    public void testGetBookById() {
        // Определяем поведение мок-объекта
        when(bookRepositoryMock.findById("1")).thenReturn(new Book("1", "Book 1", "Author 1"));

        // Получаем книгу по идентификатору из BookService
        Book retrievedBook = bookService.findBookById("1");

        // Убеждаемся в ожидаемом поведении
        assertEquals("Book 1", retrievedBook.getTitle());
        verify(bookRepositoryMock).findById("1");
    }

    @Test
    public void testGetAllBooks() {
        // Определяем поведение мок-объекта
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("1", "Title 1", "Author 1"));
        bookList.add(new Book("2", "Title 2", "Author 2"));
        when(bookRepositoryMock.findAll()).thenReturn(bookList);

        // Получаем список книг из BookService
        List<Book> retrievedBooks = bookService.findAllBooks();

        // Убеждаемся в ожидаемом поведении
        assertEquals(2, retrievedBooks.size());
        verify(bookRepositoryMock).findAll();
    }
}