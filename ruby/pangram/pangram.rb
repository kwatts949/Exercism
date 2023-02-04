class Pangram
  def self.pangram?(sentence)
    sorted_sentence = sentence.split('').sort.uniq.join("").strip
   
    sorted_sentence == 'abcdefghijklmnopqrstuvwxyz'
  end
end