class Isogram
  def self.isogram?(input)
    letters_array = input.downcase.split("")
    letters_array.uniq == letters_array
  end
end