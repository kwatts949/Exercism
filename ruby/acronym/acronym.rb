class Acronym
  def self.abbreviate(str)
    str.upcase.scan(/\b[A-Z]/).join
  end
end
  
  
