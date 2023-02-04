class Pangram
  def self.pangram?(sentence)
    #sorted_sentence = sentence.split('').sort.uniq.join("").strip

    sorted_sentence = sentence.scan(/[a-z]/).sort.uniq.join('')
    p sorted_sentence
    sorted_sentence == 'abcdefghijklmnopqrstuvwxyz'
  end
end