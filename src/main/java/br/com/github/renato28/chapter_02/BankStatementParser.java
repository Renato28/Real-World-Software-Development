package br.com.github.renato28.chapter_02;

import java.util.List;

public interface BankStatementParser {
   BankTransaction parseFrom(String line);
   List<BankTransaction> parseLinesFrom(List<String> lines);
}
