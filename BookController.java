package com.spring.casestudy.dao.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.spring.casestudy.Book;
import com.spring.casestudy.dao.BookDAO;
@Controller
public class BookController 
{
	 BookDAO bdao;
		@Autowired
		BookController(BookDAO bdao)
		{
			this.bdao=bdao;
		}
		@GetMapping("/bookPage")
		public String getBookPage(Model model)
		{
			model.addAttribute("book",new Book(0,"",0.0,""));
			return "DisplayBook";
		}
		@GetMapping("/bookCRUD")
		public String bookCrud(@RequestParam("sub")String sub,@RequestParam("bookid")int bookid,@RequestParam("bookname")String bookname,@RequestParam("price")double price,@RequestParam("author")String author,RedirectAttributes ra)
		{
			ra.addFlashAttribute("book",new Book(bookid,bookname,price,author));
			String val="";
			if(sub.equals("Add_BookDetails"))   val="addBookdetails";
			else if(sub.equals("Del_BookDetails")) val="deleteBookDetails";
			else if(sub.equals("Mod_BookDetails")) val="modifyBookDetails";
			else val="getBookDetails";
			return "redirect:"+val;
		}
		@GetMapping("/addBook")
		public String addBookDetails(@ModelAttribute("book")Book b)
		{
			bdao.insertBook(new Book(b.getBookid(),b.getBookname(),b.getPrice(),b.getAuthor()));
			return "DisplayEmployee";
		}
		@GetMapping("/modifyBook")
		public String modifyBookDetails(@ModelAttribute("book")Book b)
		{
			bdao.modifyBook(new Book(b.getBookid(),b.getBookname(),b.getPrice(),b.getAuthor()));
			return "DisplayBook";
		}
		@GetMapping("/deleteBook")
		public String deleteBookDetails(@ModelAttribute("book")Book b)
		{
			bdao.deleteBook(b.getBookid());
			return "DisplayBook";
		}
		@GetMapping("/getBook")
		public String getBookDetails(@ModelAttribute("book")Book b,Model model)
		{
			Book b1 = bdao.getBook(b.getBookid());
			model.addAttribute("book",b1);
			return "DisplayBook";
			
	    }
}
