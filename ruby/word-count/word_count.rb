class Phrase
  def initialize(phrase)
    @phrase = phrase
  end

  def word_count
    hash = @phrase.downcase.scan(/\b[\w\']+\b/).group_by{ |item| item }
    hash.each { |item| hash[item[0]] = item[1].length }
  end
end